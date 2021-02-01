package com.hawkins;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Gearbox mc = new Gearbox(6);
        Gearbox.Gear first = mc.new Gear(1,12.3);
        System.out.println(first.driveSpeed(2000));

    }
}
