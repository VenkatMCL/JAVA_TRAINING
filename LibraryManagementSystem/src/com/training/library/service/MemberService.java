package com.training.library.service;

import java.util.Map;

import com.training.library.exception.MemberNotFoundException;
import com.training.library.model.Member;
import com.training.library.util.LibraryData;

public class MemberService {

    // Register Member
    public void registerMember(Member member) {

        LibraryData.members.put(member.getMemberId(), member);

        System.out.println("Member Registered Successfully.");

    }

    // Search Member
    public Member searchMember(int memberId)
            throws MemberNotFoundException {

        Member member = LibraryData.members.get(memberId);

        if (member == null) {

            throw new MemberNotFoundException(
                    "Member ID " + memberId + " not found.");

        }

        return member;

    }

    // Remove Member
    public void removeMember(int memberId)
            throws MemberNotFoundException {

        if (!LibraryData.members.containsKey(memberId)) {

            throw new MemberNotFoundException(
                    "Member ID " + memberId + " not found.");

        }

        LibraryData.members.remove(memberId);

        System.out.println("Member Removed Successfully.");

    }

    // Update Mobile Number
    public void updateMobile(int memberId,
                             String mobile)
            throws MemberNotFoundException {

        Member member = searchMember(memberId);

        member.setMobile(mobile);

        System.out.println("Mobile Updated Successfully.");

    }

    // Display All Members
    public void displayMembers() {

        if (LibraryData.members.isEmpty()) {

            System.out.println("No Members Registered.");

            return;

        }

        for (Map.Entry<Integer, Member> entry :
                LibraryData.members.entrySet()) {

            entry.getValue().displayMember();

        }

    }

}