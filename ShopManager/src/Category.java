public enum Category {
    FOOD("Thuc pham"), HOUSEWARE("Do gia dung"), COSMETICS("My pham"), FASHION("Thoi trang");

    private String value;

    private Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
