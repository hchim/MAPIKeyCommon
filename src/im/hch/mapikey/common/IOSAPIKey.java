package im.hch.mapikey.common;

public class IOSAPIKey extends APIKey {
    private static final String JSON_FORMAT = "{\"version\":\"%s\",\"algorithm\":\"%s\",\"bundleId\":\"%s\"}";

    private String bundleId;

    @Override
    public String toJson() {
        return String.format(JSON_FORMAT, version.name(), algorithm, bundleId);
    }

    public String getBundleId() {
        return bundleId;
    }

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }
}
