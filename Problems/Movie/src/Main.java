class Movie {
    private String title;
    private String desc = "empty";
    private int year;

    // write two constructors here
    Movie(String title, String desc, int year) {
        this.desc = desc;
        this.title = title;
        this.year = year;
    }

    Movie(String title, int year){
        this.title = title;
        this.year = year;
    }
    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getYear() {
        return year;
    }
}