package minhaPratica.classes;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import minhaPratica.enums.Occupations;

public class User extends BaseClass {

	private Date dataBirth;
	private int occupation; // ATRIBUIR DESCONTO VARIAVEL

	public User(String name, Date dataBirth, Occupations occupation) {
		super(name);

		setDataBirth(dataBirth);
		setOccupation(occupation);
	}

	public Date getDataBirth() {
		return dataBirth;
	}

	public void setDataBirth(Date dataBirth) {
		this.dataBirth = dataBirth;
	}

	public int getAge() {
		DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		// Converte a String para LocalDate
		LocalDate birth = LocalDate.parse(dataBirth.toString(), dataFormatter);
		// Pega a data atual
		LocalDate today = LocalDate.now();

		// Calcula a diferença em anos
		return Period.between(birth, today).getYears();
	}

	public void setOccupation(Occupations ocuppation) {
		switch (ocuppation) {
		case Occupations.DESEMPREGADO:
			this.occupation = 0;
			break;
		case Occupations.AUTONOMO:
			this.occupation = 1;
			break;
		case Occupations.CARTEIRA_ASSINADA:
			this.occupation = 2;
			break;
		}
	}

	public int getOccupation() {
		return occupation;
	}
}
