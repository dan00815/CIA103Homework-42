package hw8;

import java.util.Objects;

public class Train implements Comparable<Train> {
//	- 班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String
//	- 目的地 dest,型別為String - 票價 price,型別為double
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public Train() {
		super();
	}

	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

//	取得車次資訊
	public void getTrain() {
		System.out.println(type + "，車次" + number + " " + start + "往" + dest + "，票價" + price);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

//	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj != null && obj.getClass() == this.getClass()) {
			Train t = (Train) obj;
			if (this.number == t.number && this.type.equals(t.type) && this.start.equals(t.start)
					&& this.dest.equals(t.dest) && this.price == t.price)
				return true;
		}

		return false;

	};

	@Override
	public int compareTo(Train train) {
		if (this.number > train.number) {
			return -1;
		}
		if (this.number == train.number) {
			return 0;
		}
		return 1;
	}
}
