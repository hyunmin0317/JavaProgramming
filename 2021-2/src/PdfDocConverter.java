class PdfDocConverter extends DocConverter {
	public PdfDocConverter() {
		super("pdf");
	}

	@Override
	public void save(String fileName) {
		System.out.println(fileName+getExtension()+"�� ��ȯ�ؼ� �����մϴ�.");
	}
}
