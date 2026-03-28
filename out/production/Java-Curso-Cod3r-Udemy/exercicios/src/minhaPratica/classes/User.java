package minhaPratica.classes;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import minhaPratica.enums.Occupations;

public class User extends BaseClass {

	private String email;
	private Date dataBirth;
	private int occupation; // ATRIBUIR DESCONTO VARIAVEL
	private List<Shopping> purchaseHistory;

	public User(String name, String email, Date dataBirth, Occupations occupation) {
		super(name);

		setEmail(email);
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public List<Shopping> getPurchaseHistory() {
		return purchaseHistory;
	}

	public void setPurchaseInHistory(Shopping purchaseHistory) {
		int indexPurchase = this.purchaseHistory.indexOf(purchaseHistory);

		if (indexPurchase == -1) {
			this.purchaseHistory.add(purchaseHistory);
		} else {
			this.purchaseHistory.set(indexPurchase, purchaseHistory);
		}
	}

	public double getTotalAmountSpent() {
		double totalValue = 0;

		for (Shopping shopping : purchaseHistory) {
			totalValue += shopping.getTotalAmount();
		}

		return totalValue;
	}

}
