public class Contents {
    protected String title;
    protected String description;

    public Contents(String title, String description) {
        this.title = title;
        this.description = description;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
    }
}

// Class for Videos
class Videos extends Contents {
    private int duration;

    public Videos(String title, String description, int duration) {
        super(title, description);
        this.duration = duration;
    }

    // Getter for duration
    public int getDuration() {
        return duration;
    }

    // Setter for duration
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Duration: " + duration + " minutes");
    }
}

// Class for PowerPoints
class Quiz extends Contents {
    private int slideCount;

    public Quiz(String title, String description, int slideCount) {
        super(title, description);
        this.slideCount = slideCount;
    }

    // Getter for slideCount
    public int getSlideCount() {
        return slideCount;
    }

    // Setter for slideCount
    public void setSlideCount(int slideCount) {
        this.slideCount = slideCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Slide Count: " + slideCount);
    }
}

// Class for Materials (PDFs)
class Materials extends Contents {
    private int pageCount;

    public Materials(String title, String description, int pageCount) {
        super(title, description);
        this.pageCount = pageCount;
    }

    // Getter for pageCount .
    public int getPageCount() {
        return pageCount;
    }

    // Setter for pageCount
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Page Count: " + pageCount);
    }
}
