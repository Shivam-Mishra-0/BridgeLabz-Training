package com.parceltracker;

public class ParcelTrackerMain {
	public static void main(String[] args) {

        ParcelTracker tracker = new ParcelTracker();

        tracker.trackParcel();

        tracker.addCheckpoint("Shipped", "Reached Warehouse");
        tracker.trackParcel();

        tracker.markParcelLost();
        tracker.trackParcel();
    }
}
