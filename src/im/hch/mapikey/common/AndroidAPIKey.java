package im.hch.mapikey.common;

public class AndroidAPIKey extends APIKey {
    private static final String JSON_FORMAT = "{\"version\":\"%s\",\"algorithm\":\"%s\",\"packageName\":\"%s\",\"signature\":\"%s\"}";

    /**
     * The package name of the Android application.
     */
    private String packageName;
    /**
     * The signature (by default it is the SHA256 signature) of the public key certificate of the application.
     */
    private String signature;

    @Override
    public String toJson() {
        return String.format(JSON_FORMAT, version.name(), algorithm, packageName, signature);
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
