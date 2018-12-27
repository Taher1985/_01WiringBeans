package _05_com.spring.beanScoping;

public class _01Juggler {

	private _02Ticket ticket;

	public _01Juggler(_02Ticket ticket) {
		super();
		this.ticket = ticket;
	}

	public String getTicketPattern() {
		return ticket.getTicketPattern();
	}

	public void setTicketPatter(String ticketPattern) {
		ticket.setTicketPattern(ticketPattern);
	}

}
