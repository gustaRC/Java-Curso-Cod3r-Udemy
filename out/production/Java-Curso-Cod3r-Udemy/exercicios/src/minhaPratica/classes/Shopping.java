package minhaPratica.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Shopping {

	private long id;
	private List<Item> items = new ArrayList<Item>();
	private Date issueDate;
	private User user;

	public Shopping(List<Item> items, User user) {
		setId();
		setItems(items);
		setIssueDate();
		user.setPurchaseInHistory(this);
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	private void setIssueDate() {
		this.issueDate = new Date();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
		this.user.setPurchaseInHistory(this);
	}
	
	public long getId() {
		return id;
	}

	private void setId() {
		id = ThreadLocalRandom.current().nextInt(100000, 999999);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, issueDate, items, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shopping other = (Shopping) obj;
		return id == other.id && Objects.equals(issueDate, other.issueDate) && Objects.equals(items, other.items)
				&& Objects.equals(user, other.user);
	}

	public double getTotalAmount() {
		double valueFinal = 0;
		
		for (Item item : items) {
			valueFinal += item.getTotalPrice(user.getOccupation());
		}
		
		return valueFinal;
	}
	
	
}
