class OdtDocConverter extends DocConverter {
	public OdtDocConverter() {
		super("odt");
	}

	@Override
	public void save(String fileName) {
		System.out.println(fileName+getExtension()+"�� ��ȯ�ؼ� �����մϴ�.");
	}
}
