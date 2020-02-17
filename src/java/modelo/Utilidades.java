/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author DAW209
 */
public class Utilidades {

	public static ArrayList<String> getArchivos(String sDirectorio) {
		ArrayList<String> archivos = new ArrayList<String>();
		File dir = new File(sDirectorio);
		String[] ficheros = dir.list();

		if (ficheros != null) {
			for (int x = 0; x < ficheros.length; x++) {
				if (ficheros[x].endsWith(".jpg") || ficheros[x].endsWith(".gif") || ficheros[x].endsWith(".png")) {
					archivos.add(ficheros[x]);
				}
			}
		}

		return archivos;
	}

}
