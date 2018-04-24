/**
 * 
 */
package com.learning.observerdesignpattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Mayank
 *
 */
public class CricketData implements Subject {

	int runs;
	int wickets;
	float overs;
	ArrayList<Observer> observerList = new ArrayList<Observer>();

	/**
	 * @return the runs
	 */
	public int getRuns() {
		return runs;
	}

	/**
	 * @param runs the runs to set
	 */
	public void setRuns(int runs) {
		this.runs = runs;
	}

	/**
	 * @return the wickets
	 */
	public int getWickets() {
		return wickets;
	}

	/**
	 * @param wickets the wickets to set
	 */
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	/**
	 * @return the overs
	 */
	public float getOvers() {
		return overs;
	}

	/**
	 * @param overs the overs to set
	 */
	public void setOvers(float overs) {
		this.overs = overs;
	}

	/**
	 * @return the observerList
	 */
	public ArrayList<Observer> getObserverList() {
		return observerList;
	}

	/**
	 * @param observerList the observerList to set
	 */
	public void setObserverList(ArrayList<Observer> observerList) {
		this.observerList = observerList;
	}

	@Override
	public void registerObserver(Observer o) {
		observerList.add(o);

	}

	@Override
	public void unregisterObserver(Observer o) {
		observerList.remove(observerList.indexOf(o));

	}

	@Override
	public void notifyObservers() {
		for (Iterator<Observer> it = observerList.iterator(); it.hasNext();) {
			Observer o = it.next();
			o.update(runs,wickets,overs);
		}
	}

	public void dataChanged() {
		//get latest data
		runs = getLatestRuns();
		wickets = getLatestWickets();
		overs = getLatestOvers();

		notifyObservers();
	}

	// get latest runs from stadium
	private int getLatestRuns() {
		// return 90 for simplicity
		return 90;
	}

	// get latest wickets from stadium
	private int getLatestWickets() {
		// return 2 for simplicity
		return 2;
	}

	// get latest overs from stadium
	private float getLatestOvers() {
		// return 90 for simplicity
		return (float)10.2;
	}

}
