class Mahasiswa {
    private String nama;
    private int umur;
    private String jurusan;

    public Mahasiswa(String nama, int umur, String jurusan) {
        this.nama = nama;
        this.umur = umur;
        this.jurusan = jurusan;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getJurusan() {
        return jurusan;
    }
}
