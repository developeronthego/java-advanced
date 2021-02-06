package advanced.lesson6;

public class InternalApi {

	@JsonField("ver")
	private String version;
	@JsonField("snap")
	private String snapshot;
	@JsonField("dependency")
	private String dependency;
	
	public InternalApi() {
	}
	
	public InternalApi(String version, String snapshot, String dependency) {
		this.version = version;
		this.snapshot = snapshot;
		this.dependency = dependency;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSnapshot() {
		return snapshot;
	}

	public void setSnapshot(String snapshot) {
		this.snapshot = snapshot;
	}

	public String getDependency() {
		return dependency;
	}

	public void setDependency(String dependency) {
		this.dependency = dependency;
	}

	@Override
	public String toString() {
		return "InternalApi [version=" + version + ", snapshot=" + snapshot + ", dependency=" + dependency + "]";
	}
	
}
