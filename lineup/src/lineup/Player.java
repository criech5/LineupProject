package lineup;

public class Player {
	
	String name = "";
	int games = 0; 
	int year = 0; 
	int age = 0; 
	String team = "";
	String league = "";
	int pa = 0; 
	int ab = 0;
	int r = 0; 
	int h = 0; 
	int doubles = 0;
	int triples = 0; 
	int hr = 0; 
	int rbi = 0;
	int bb = 0;
	int ibb = 0;
	int so = 0;
	int hbp = 0;
	int sh = 0;
	int sf = 0;
	int gdp = 0;
	int sb = 0;
	int cs = 0;
	double avg = 0.0;
	double obp = 0.0;
	double slg = 0.0; 
	double ops = 0;
	double score = 0.0;
	
	public Player(String name, int games, int year, int age, String team, String league, int pa, int ab, int r, int h, int doubles,
			int triples, int hr, int rbi, int bb, int ibb, int so, int hbp, int sh, int sf, int gdp, int sb, int cs,
			double avg, double obp, double slg, double ops) {
		super();
		this.name = name;
		this.games = games;
		this.year = year;
		this.age = age;
		this.team = team;
		this.league = league;
		this.pa = pa;
		this.ab = ab;
		this.r = r;
		this.h = h;
		this.doubles = doubles;
		this.triples = triples;
		this.hr = hr;
		this.rbi = rbi;
		this.bb = bb;
		this.ibb = ibb;
		this.so = so;
		this.hbp = hbp;
		this.sh = sh;
		this.sf = sf;
		this.gdp = gdp;
		this.sb = sb;
		this.cs = cs;
		this.avg = avg;
		this.obp = obp;
		this.slg = slg;
		this.ops = ops;
		this.score = 0.0;
	}
	
	public String toStringAll() {
		String s = "";
		s += this.name + ", " + this.games + ", " + this.year +", " + this.age + ", " +
		this.team + ", " + this.league + ", " + this.pa + ", " + this.ab + ", " + this.r +
		", " + this.h + ", " + this.doubles + ", " + this.triples + ", " + this.hr + ", "
		+ this.rbi + ", " + this.bb + ", " + this.ibb + ", " + this.so + ", " + this.hbp
		+ ", " + this.sh + ", " + this.sf + ", " + this.gdp + ", " + this.sb + ", " +
		this.sb + ", " + this.cs + ", " + this.avg + ", " + this.obp + ", "
		+ this.slg + ", " + this.ops;
		return s;
	}
	
	public String slashLine() {
		String s = "";
		s+= this.avg + "/" + this.obp + "/" + this.slg;
		return s;
	}
	
	public void addToScore(double value) {
		this.score += value;
	}
	
	public void subtractFromScore(double value) {
		this.score -= value;
	}

	
	
}
