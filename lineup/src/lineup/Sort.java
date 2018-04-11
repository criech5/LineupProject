package lineup;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
	
	public static ArrayList<Player> sortByGames (ArrayList<Player> list) {
		ArrayList<Player> newList = new ArrayList<Player>();
		
		if (newList.size() <= 0) {
			newList.add(list.get(0));
		}
		for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < newList.size(); j++) {
					if (list.get(i).games > newList.get(j).games) {
						newList.add(j, list.get(i));
						break;
					}
				}
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}

		return newList;
	}
	
	public static ArrayList<Player> sortByAge (ArrayList<Player> list) {
		ArrayList<Player> newList = new ArrayList<Player>();
		
		if (newList.size() <= 0) {
			newList.add(list.get(0));
		}
		for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < newList.size(); j++) {
					if (list.get(i).age > newList.get(j).age) {
						newList.add(j, list.get(i));
						break;
					}
				}
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}

		return newList;
	}
	
	public static ArrayList<Player> sortByPAs (ArrayList<Player> list) {
		ArrayList<Player> newList = new ArrayList<Player>();
		
		if (newList.size() <= 0) {
			newList.add(list.get(0));
		}
		for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < newList.size(); j++) {
					if (list.get(i).pa > newList.get(j).pa) {
						newList.add(j, list.get(i));
						break;
					}
				}
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}

		return newList;
	}
	
	public static ArrayList<Player> sortByABs (ArrayList<Player> list) {
		ArrayList<Player> newList = new ArrayList<Player>();
		
		if (newList.size() <= 0) {
			newList.add(list.get(0));
		}
		for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < newList.size(); j++) {
					if (list.get(i).ab > newList.get(j).ab) {
						newList.add(j, list.get(i));
						break;
					}
				}
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}

		return newList;
	}
	
	public static ArrayList<Player> sortByRuns (ArrayList<Player> list) {
		ArrayList<Player> newList = new ArrayList<Player>();
		
		if (newList.size() <= 0) {
			newList.add(list.get(0));
		}
		for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < newList.size(); j++) {
					if (list.get(i).r > newList.get(j).r) {
						newList.add(j, list.get(i));
						break;
					}
				}
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}

		return newList;
	}
	
	public static ArrayList<Player> sortByHits (ArrayList<Player> list) {
		ArrayList<Player> newList = new ArrayList<Player>();
		
		if (newList.size() <= 0) {
			newList.add(list.get(0));
		}
		for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < newList.size(); j++) {
					if (list.get(i).h > newList.get(j).h) {
						newList.add(j, list.get(i));
						break;
					}
				}
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}

		return newList;
	}
	
	public static ArrayList<Player> sortByDoubles (ArrayList<Player> list) {
		ArrayList<Player> newList = new ArrayList<Player>();
		
		if (newList.size() <= 0) {
			newList.add(list.get(0));
		}
		for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < newList.size(); j++) {
					if (list.get(i).doubles > newList.get(j).doubles) {
						newList.add(j, list.get(i));
						break;
					}
				}
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}

		return newList;
	}
	
	public static ArrayList<Player> sortByTriples (ArrayList<Player> list) {
		ArrayList<Player> newList = new ArrayList<Player>();
		
		if (newList.size() <= 0) {
			newList.add(list.get(0));
		}
		for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < newList.size(); j++) {
					if (list.get(i).triples > newList.get(j).triples) {
						newList.add(j, list.get(i));
						break;
					}
				}
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}

		return newList;
	}
	
	public static ArrayList<Player> sortByHomers (ArrayList<Player> list) {
		ArrayList<Player> newList = new ArrayList<Player>();
		
		if (newList.size() <= 0) {
			newList.add(list.get(0));
		}
		for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < newList.size(); j++) {
					if (list.get(i).hr > newList.get(j).hr) {
						newList.add(j, list.get(i));
						break;
					}
				}
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}

		return newList;
	}
	
	public static ArrayList<Player> sortByRBI (ArrayList<Player> list) {
		ArrayList<Player> newList = new ArrayList<Player>();
		
		if (newList.size() <= 0) {
			newList.add(list.get(0));
		}
		for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < newList.size(); j++) {
					if (list.get(i).rbi > newList.get(j).rbi) {
						newList.add(j, list.get(i));
						break;
					}
				}
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}

		return newList;
	}
	
	public static ArrayList<Player> sortByWalks (ArrayList<Player> list) {
		ArrayList<Player> newList = new ArrayList<Player>();
		
		if (newList.size() <= 0) {
			newList.add(list.get(0));
		}
		for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < newList.size(); j++) {
					if (list.get(i).bb > newList.get(j).bb) {
						newList.add(j, list.get(i));
						break;
					}
				}
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}

		return newList;
	}
	
	public static ArrayList<Player> sortByIntentionalWalks (ArrayList<Player> list) {
		ArrayList<Player> newList = new ArrayList<Player>();
		
		if (newList.size() <= 0) {
			newList.add(list.get(0));
		}
		for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < newList.size(); j++) {
					if (list.get(i).ibb > newList.get(j).ibb) {
						newList.add(j, list.get(i));
						break;
					}
				}
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}

		return newList;
	}
	
	public static ArrayList<Player> sortByStrikeouts (ArrayList<Player> list) {
		ArrayList<Player> newList = new ArrayList<Player>();
		
		if (newList.size() <= 0) {
			newList.add(list.get(0));
		}
		for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < newList.size(); j++) {
					if (list.get(i).so > newList.get(j).so) {
						newList.add(j, list.get(i));
						break;
					}
				}
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}

		return newList;
	}
	
	public static ArrayList<Player> sortByHBP (ArrayList<Player> list) {
		ArrayList<Player> newList = new ArrayList<Player>();
		
		if (newList.size() <= 0) {
			newList.add(list.get(0));
		}
		for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < newList.size(); j++) {
					if (list.get(i).hbp > newList.get(j).hbp) {
						newList.add(j, list.get(i));
						break;
					}
				}
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}

		return newList;
	}
	
	public static ArrayList<Player> sortBySacHits (ArrayList<Player> list) {
		ArrayList<Player> newList = new ArrayList<Player>();
		
		if (newList.size() <= 0) {
			newList.add(list.get(0));
		}
		for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < newList.size(); j++) {
					if (list.get(i).sh > newList.get(j).sh) {
						newList.add(j, list.get(i));
						break;
					}
				}
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}

		return newList;
	}
	
	public static ArrayList<Player> sortBySacFlies (ArrayList<Player> list) {
		ArrayList<Player> newList = new ArrayList<Player>();
		
		if (newList.size() <= 0) {
			newList.add(list.get(0));
		}
		for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < newList.size(); j++) {
					if (list.get(i).sf > newList.get(j).sf) {
						newList.add(j, list.get(i));
						break;
					}
				}
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}

		return newList;
	}
	
	public static ArrayList<Player> sortByGDP (ArrayList<Player> list) {
		ArrayList<Player> newList = new ArrayList<Player>();
		
		if (newList.size() <= 0) {
			newList.add(list.get(0));
		}
		for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < newList.size(); j++) {
					if (list.get(i).gdp > newList.get(j).gdp) {
						newList.add(j, list.get(i));
						break;
					}
				}
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}

		return newList;
	}
	
	public static ArrayList<Player> sortBySteals (ArrayList<Player> list) {
		ArrayList<Player> newList = new ArrayList<Player>();
		
		if (newList.size() <= 0) {
			newList.add(list.get(0));
		}
		for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < newList.size(); j++) {
					if (list.get(i).sb > newList.get(j).sb) {
						newList.add(j, list.get(i));
						break;
					}
				}
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}

		return newList;
	}
	
	public static ArrayList<Player> sortByCaughtStealing (ArrayList<Player> list) {
		ArrayList<Player> newList = new ArrayList<Player>();
		
		if (newList.size() <= 0) {
			newList.add(list.get(0));
		}
		for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < newList.size(); j++) {
					if (list.get(i).cs > newList.get(j).cs) {
						newList.add(j, list.get(i));
						break;
					}
				}
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}

		return newList;
	}
	
	public static ArrayList<Player> sortByAverage (ArrayList<Player> list) {
		ArrayList<Player> newList = new ArrayList<Player>();
		
		if (newList.size() <= 0) {
			newList.add(list.get(0));
		}
		for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < newList.size(); j++) {
					if (list.get(i).avg > newList.get(j).avg) {
						newList.add(j, list.get(i));
						break;
					}
				}
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}

		return newList;
	}
	
	public static ArrayList<Player> sortByOBP (ArrayList<Player> list) {
		ArrayList<Player> newList = new ArrayList<Player>();
		
		if (newList.size() <= 0) {
			newList.add(list.get(0));
		}
		for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < newList.size(); j++) {
					if (list.get(i).obp > newList.get(j).obp) {
						newList.add(j, list.get(i));
						break;
					}
				}
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}

		return newList;
	}
	
	public static ArrayList<Player> sortBySLG (ArrayList<Player> list) {
		ArrayList<Player> newList = new ArrayList<Player>();
		
		if (newList.size() <= 0) {
			newList.add(list.get(0));
		}
		for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < newList.size(); j++) {
					if (list.get(i).slg > newList.get(j).slg) {
						newList.add(j, list.get(i));
						break;
					}
				}
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}

		return newList;
	}
	
	public static ArrayList<Player> sortByOPS (ArrayList<Player> list) {
		ArrayList<Player> newList = new ArrayList<Player>();
		
		if (newList.size() <= 0) {
			newList.add(list.get(0));
		}
		for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < newList.size(); j++) {
					if (list.get(i).ops > newList.get(j).ops) {
						newList.add(j, list.get(i));
						break;
					}
				}
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}

		return newList;
	}
	
	public static ArrayList<Player> sortByScore (ArrayList<Player> list) {
		ArrayList<Player> newList = new ArrayList<Player>();
		
		if (newList.size() <= 0) {
			newList.add(list.get(0));
		}
		for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < newList.size(); j++) {
					if (list.get(i).score > newList.get(j).score) {
						newList.add(j, list.get(i));
						break;
					}
				}
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}

		return newList;
	}
	
	public Player choosePlayer(ArrayList<Player> position, int prefPwr, int prefHit, int prefSpd, int prefIQ) {
		scorePower(position, prefPwr);
		scoreHit(position, prefHit);
		scoreSpeed(position, prefSpd);
		scoreIQ(position, prefIQ);
		
		return sortByScore(position).get(0);
	}
	
	public void scorePower(ArrayList<Player> pos, int pref) {
		ArrayList<Player> list1 = sortByHomers(pos);
		Collections.reverse(list1);
		
		ArrayList<Player> list2 = sortBySLG(pos);
		Collections.reverse(list2);
		
		for (int i = 0; i < list1.size(); i++) {
			list1.get(i).addToScore(i + (5*pref));
			list2.get(i).addToScore(i + (4*pref));
		}
	}
	
	public void scoreHit(ArrayList<Player> pos, int pref) {
		ArrayList<Player> list1 = sortByAverage(pos);
		Collections.reverse(list1);
		
		ArrayList<Player> list2 = sortByOBP(pos);
		Collections.reverse(list2);
		
		for (int i = 0; i < list1.size(); i++) {
			list1.get(i).addToScore(i + (5*pref));
			list2.get(i).addToScore(i + (5*pref));
		}
	}
	
	public void scoreSpeed(ArrayList<Player> pos, int pref) {
		ArrayList<Player> list1 = sortBySteals(pos);
		Collections.reverse(list1);
		
		ArrayList<Player> list2 = sortByCaughtStealing(pos);
		Collections.reverse(list2);
		
		for (int i = 0; i < list1.size(); i++) {
			list1.get(i).addToScore(i + (5*pref));
			list2.get(i).subtractFromScore((i / 3.0) + (pref));
		}
	}
	
	public void scoreIQ(ArrayList<Player> pos, int pref) {
		ArrayList<Player> list1 = sortByWalks(pos);
		Collections.reverse(list1);
		
		ArrayList<Player> list2 = sortByStrikeouts(pos);
		Collections.reverse(list2);
		
		for (int i = 0; i < list1.size(); i++) {
			list1.get(i).addToScore(i + (6*pref));
			list2.get(i).subtractFromScore(i + (4.5*pref));
		}
	}

}
