package br.com.breakingpizza.breakingpizza.database;

public class TenantContext {

	private static ThreadLocal<String> tenantSchema = new ThreadLocal<>();

	public static String getTenantSchema() {
		return tenantSchema.get();
	}

	public static void setTenantSchema(String schema) {
		tenantSchema.set(schema);
	}
}
