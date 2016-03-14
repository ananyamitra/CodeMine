package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MeetingManager {
	
	public static void main(String[] args){
		
		Meeting m = new Meeting(2, 4);
		Meeting m1 = new Meeting(7, 9);
		Meeting m2 = new Meeting(6, 10);
		Meeting m3 = new Meeting(11, 14);
		Meeting m4 = new Meeting(12, 13);
		
		List<Meeting> meetingList = new ArrayList<Meeting>();
		meetingList.add(m);
		meetingList.add(m1);
		meetingList.add(m2);
		meetingList.add(m3);
		meetingList.add(m4);
		
		
		System.out.println(condenseMeetings(meetingList));
		
	}
	
	public static List<Meeting> condenseMeetings(List<Meeting> meetingList){
		
		//Sort the list of Meetings based on start time
		Collections.sort(meetingList, new Comparator<Meeting>() {

			public int compare(Meeting o1, Meeting o2) {
				
				return o1.startTime - o2.startTime;
			}
		});
		
		List<Meeting> condensedList = new ArrayList<Meeting>();
		condensedList.add(meetingList.get(0));
		
		for(int i = 1; i< meetingList.size(); i++){
			Meeting consolidateMeeting = condensedList.get(condensedList.size()-1);
			Meeting currentMeeting  = meetingList.get(i);
			
			
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
