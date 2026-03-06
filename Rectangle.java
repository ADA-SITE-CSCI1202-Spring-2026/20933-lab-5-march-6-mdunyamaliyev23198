class Rectangle{
    int width, height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    @Override
    public boolean equals(Object obj) {

        
        if (!(obj instanceof Rectangle)) {
            return false;
        }

        Rectangle rect = (Rectangle) obj;

        return this.width == rect.width && this.height == rect.height;
    }
    
}
