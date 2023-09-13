class AccessModifiersDemo {
    private int privateVar;
    double defaultVar; // Default (package-private) access
    protected boolean protectedVar;
    public String publicVar;

    // Task 2: Implement Methods
    public int getPrivateVar() {
        return privateVar;
    }

    double getDefaultVar() {
        return defaultVar;
    }

    protected boolean getProtectedVar() {
        return protectedVar;
    }

    public String getPublicVar() {
        return publicVar;
    }
}