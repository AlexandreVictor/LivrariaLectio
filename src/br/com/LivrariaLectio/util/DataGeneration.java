package br.com.LivrariaLectio.util;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import br.com.LivrariaLectio.entidade.Livro;


public class DataGeneration {
	/**
	 * Método que vai criar a tabela Especificar a entidade em
	 * conf.addAnnotatedClass Baseado nos atributos da classe, vai criar os
	 * campos da tabela
	 */
	public static void main(String[] args) {

		AnnotationConfiguration an = new AnnotationConfiguration();
		an.addAnnotatedClass(Livro.class);

		an.configure();

		new SchemaExport(an).create(true, true);

		/*
		 * Carro aluno = null; System.out.println(aluno.getCodCurso());
		 */

	}
}