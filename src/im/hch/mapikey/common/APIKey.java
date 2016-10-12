package im.hch.mapikey.common;

public abstract class APIKey {

    public enum Version {
        V1
    };

    /**
     * The version of the API key.
     */
    protected Version version;

    /**
     * The signature of the API key.
     */
    protected String apiKeySignature;

    /**
     * The algorithm used to sign the API key.
     */
    protected String algorithm;

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public String getApiKeySignature() {
        return apiKeySignature;
    }

    public void setApiKeySignature(String apiKeySignature) {
        this.apiKeySignature = apiKeySignature;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * Convert API key to json string.
     * @return
     */
    public abstract String toJson();
}
