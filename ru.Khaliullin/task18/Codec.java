package task18;

public enum Codec {
    UTF8("UTF8"), KOI8("KOI8"),
    WINDOWS1251("WINDOWS-1251");

    String nameCod;

    Codec(String nameCod) {
        this.nameCod = nameCod;
    }

    public String getNameCod() {
        return nameCod;
    }

    @Override
    public String toString() {
        return "Codec{" +
                "nameCod='" + nameCod + '\'' +
                '}';
    }
}
