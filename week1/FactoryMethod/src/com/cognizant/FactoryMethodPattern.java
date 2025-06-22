package com.cognizant;

class worddocument implements DocumentManagement {
	@Override
	public void open() {
		System.out.println("WORD DOCUMENT IS OPEN....");
	}
}

class pdfdocument implements DocumentManagement {
	@Override
	public void open() {
		System.out.println("PDF DOCUMENT IS OPEN....");
	}
}

class exceldocument implements DocumentManagement {
	@Override
	public void open() {
		System.out.println("EXCEL DOCUMENT IS OPEN....");
	}
}

abstract class DocumentFactory {
	public abstract DocumentManagement createDocument();
}

class Worddocumentfactory extends DocumentFactory {
	@Override
	public DocumentManagement createDocument() {
		return new worddocument();
	}
}

class pdfdocumentfactory extends DocumentFactory {
	@Override
	public DocumentManagement createDocument() {
		return new pdfdocument();
	}
}

class exceldocumentfactory extends DocumentFactory {
	@Override
	public DocumentManagement createDocument() {
		return new exceldocument();
	}
}

public class FactoryMethodPattern {
	public static void main(String[] args) {
		DocumentFactory wordFactory = new Worddocumentfactory();
		DocumentManagement wordDoc = wordFactory.createDocument();
		wordDoc.open();

		DocumentFactory pdfFactory = new pdfdocumentfactory();
		DocumentManagement pdfDoc = pdfFactory.createDocument();
		pdfDoc.open();

		DocumentFactory excelFactory = new exceldocumentfactory();
		DocumentManagement excelDoc = excelFactory.createDocument();
		excelDoc.open();
	}
}

