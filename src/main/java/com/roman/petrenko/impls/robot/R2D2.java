package com.roman.petrenko.impls.robot;

import com.roman.petrenko.interfaces.*;

public class R2D2 implements Robot {
    private Hand hand;
    private Head head;
    private Leg leg;
    private Body body;

    private String color;
    private int memory;
    private double version;

    public R2D2() {
    }

    public R2D2(Hand hand, Head head, Leg leg, Body body) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
        this.body = body;
    }

    public R2D2(String color, int memory, double version) {
        this.color = color;
        this.memory = memory;
        this.version = version;
    }

    public R2D2(Hand hand, Head head, Leg leg, Body body, String color, int memory, double version) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
        this.body = body;
        this.color = color;
        this.memory = memory;
        this.version = version;
    }

    @Override
    public String toString() {
        return "R2D2{" +
                "hand=" + hand.toString() +
                ", head=" + head +
                ", leg=" + leg +
                ", body=" + body +
                ", color='" + color + '\'' +
                ", memory=" + memory +
                ", version=" + version +
                '}';
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public void action() {
        head.think();
        hand.kick();
        leg.move();
        body.contains();
    }
}
