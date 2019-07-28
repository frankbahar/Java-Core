package com.frankbahar;

import java.awt.*;

public class Room {
    String name;
    Dimensions dimensions;
    Doors doors;
    Windows windows;
    Furniture furniture;

    public Room(String name, Dimensions dimensions, Doors doors, Windows windows, Furniture furniture) {
        this.name = name;
        this.dimensions = dimensions;
        this.doors = doors;
        this.windows = windows;
        this.furniture = furniture;
    }
}
