public enum Hospitals {
    MTL("Montreal"),
    QUE("Quebec"),
    SHE("Sherbrooke");

    private final String _hospitalName;
    Hospitals(final String hospitalName) {
        _hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return _hospitalName;
    }
}
