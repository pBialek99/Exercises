public class Room {

  public class Bedroom {
    // write code here
    // fields
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;
    
    
    // constructors
    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }
    
    
    // methods
    public Lamp getLamp() {
        return this.lamp;
    }
    
    public void makeBed() {
        System.out.print("Bedroom -> Making bed | ");
        bed.make();
    }
  }

  public class Wall {
    // write code here
    // fields
    private String direction;
    
    
    // constructors
    public Wall(String direction) {
        this.direction = direction;
    }
    
    
    // methods
    public String getDirection() {
        return this.direction;
    }
  }

  public class Ceiling {
    // write code here
    // fields
    private int height;
    private int paintedColor;
    
    
    // constructors
    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }
    
    
    // methods
    public int getHeight() {
        return this.height;
    }
    
    public int getPaintedColor() {
        return this.paintedColor;
    }
  }

  public class Bed{
    // write code here
    // fields
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;
    
    
    // constructors
    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }
    
    
    // methods
    public void make() {
        System.out.print("Bed -> Making | ");
    }
    
    public String getStyle() {
        return this.style;
    }
    
    public int getPillows() {
        return this.pillows;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public int getSheets() {
        return this.sheets;
    }
    
    public int getQuilt() {
        return this.quilt;
    }
  }

  public class Lamp {
    // write code here
    // fields
    private String style;
    private boolean battery;
    private int globRating;
    
    
    // constructor
    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }
    
    
    // methods
    public void turnOn() {
        System.out.print("Lamp -> Turning on");
    }
    
    public String getStyle() {
        return this.style;
    }
    
    public boolean isBattery() {
        return this.battery;
    }

    public int getGlobRating() {
        return this.globRating;
    }
  }
}
