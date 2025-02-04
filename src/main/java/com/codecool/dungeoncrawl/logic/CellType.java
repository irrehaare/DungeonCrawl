package com.codecool.dungeoncrawl.logic;

public enum CellType {
    EMPTY("empty"),
    FLOOR("floor"),
    WALL("wall"),
    DOOR("door"),
    OPENDOOR("opendoor");

    private final String tileName;

    CellType(String tileName) {
        this.tileName = tileName;
    }

    public String getTileName() {
        return tileName;
    }

    public boolean isWalkable(){
        return switch (this) {
            case EMPTY, FLOOR, OPENDOOR -> true;
            case WALL, DOOR -> false;
        };
    }
}
