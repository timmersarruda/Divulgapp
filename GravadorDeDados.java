package br.timmers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;


public class GravadorDeDados extends SistControleDeUsuario{

	public static final String ARQUIVO_USUARIOS = "usuarios.txt";
	
	public GravadorDeDados() {
		
	}
	
	public void gravarUsuarios (List<Usuario> usuarios) throws IOException{
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ARQUIVO_USUARIOS))){
			out.writeObject(usuarios);
		} catch (Exception e){
			throw new IOException(e);
		}
	}
	
	public List<Usuario> recuperarUsuarios() throws IOException{
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ARQUIVO_USUARIOS))){
			return (List<Usuario>) in.readObject();
		}catch(Exception e) {
			throw new IOException(e);
		}
	}
	
}
