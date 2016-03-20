package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyMeetingManager {
	
	public static void main(String[] args){
		
		MyMeeting m = new MyMeeting(2, 4);
		MyMeeting m1 = new MyMeeting(7, 9);
		MyMeeting m2 = new MyMeeting(6, 10);
		MyMeeting m3 = new MyMeeting(11, 14);
		MyMeeting m4 = new MyMeeting(12, 13);
		
		List<MyMeeting> meetingList = new ArrayList<MyMeeting>();
		meetingList.add(m);
		meetingList.add(m1);
		meetingList.add(m2);
		meetingList.add(m3);
		meetingList.add(m4);
		
		
		System.out.println(condenseMeetings(meetingList));
		
	}
	
	public static List<MyMeeting> condenseMeetings(List<MyMeeting> meetingList){
		
		//Sort the list of Meetings based on start time
		Collections.sort(meetingList, new Comparator<MyMeeting>() {

			public int compare(MyMeeting o1, MyMeeting o2) {
				
				return o1.startTime - o2.startTime;
			}
		});
		
		List<MyMeeting> condensedList = new ArrayList<MyMeeting>();
		condensedList.add(meetingList.get(0));
		
		for(int i = 1; i< meetingList.size(); i++){
			MyMeeting consolidateMeeting = condensedList.get(condensedList.size()-1);
			MyMeeting currentMeeting  = meetingList.get(i);
			
			
			if(currentMeeting.startTime > consolidateMeeting.endTime){
				condensedList.add(currentMeeting);
			}
			else{
				if(currentMeeting.endTime > consolidateMeeting.endTime){
					consolidateMeeting.endTime = currentMeeting.endTime;
				}
			}
		}
		return condensedList;
	}

}
