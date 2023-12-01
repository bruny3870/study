package etc;

public class Student {
	private int grade;		//학년
	private int group;		//반
	private int num;		//번
	private String name;	//이름
	private int kor;		//국어점수
	private int eng;		//영어점수
	private int math;		//수학점수
	private int sum;		//총점
	private double avg;		//평균
	private int rank;		//등수
	
	public Student() {
		this(0, 0, 0, "", 0, 0, 0);
	}
	
	public Student(int grade, int group, int num, String name, int kor, int eng, int math) {
		setGrade(grade);
		setGroup(group);
		setNum(num);
		setName(name);
		setKor(kor);
		setEng(eng);
		setMath(math);
		setSum(getKor() + getEng() + getMath());
		setAvg((double)getSum() / 3);
		setRank(0);
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		String value = "등수 : " + getRank() + "\n";
		value += getGrade() + "학년 " + getGroup() + "반 " + getNum() + "번 " + getName() + "\n";
		value += "국어 : " + getKor() + ", 영어 : " + getEng() + ", 수학 : " + getMath() + "\n";
		value += "총점 : " + getSum() + "\n";
		value += "평균 : " + String.format("%.1f", getAvg()) + "\n";
		return value;
	}
	
}
