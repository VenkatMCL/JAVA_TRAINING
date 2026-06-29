package com.training.library.model;

public class Member {

    private int memberId;
    private String memberName;
    private String email;
    private String mobile;
    private int booksBorrowed;

    public Member() {

    }

    public Member(int memberId,
                  String memberName,
                  String email,
                  String mobile,
                  int booksBorrowed) {

        this.memberId = memberId;
        this.memberName = memberName;
        this.email = email;
        this.mobile = mobile;
        this.booksBorrowed = booksBorrowed;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public int getBooksBorrowed() {
        return booksBorrowed;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setBooksBorrowed(int booksBorrowed) {
        this.booksBorrowed = booksBorrowed;
    }

    public void displayMember() {

        System.out.println("-------------------------------");
        System.out.println("Member Id        : " + memberId);
        System.out.println("Member Name      : " + memberName);
        System.out.println("Email            : " + email);
        System.out.println("Mobile           : " + mobile);
        System.out.println("Books Borrowed   : " + booksBorrowed);
    }

}