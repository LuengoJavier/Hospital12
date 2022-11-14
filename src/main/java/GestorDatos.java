import java.io.*;
class GestorDatos {
    public static Hospital almacenarDoctores(Hospital hospital) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            archivo = new File ("C:\\Users\\jluen\\IdeaProjects\\Hospital1\\src\\doctor.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while((linea=br.readLine())!=null ) {
                String[] datos = linea.split(",");
                hospital.contratarDoctor(datos[0], datos[1],Integer.parseInt(datos[2]));
            }
        }
        catch(Exception e){
            e.printStackTrace();

        }
        finally{
                try{
                    if( null != fr ){
                        fr.close();
                    }
                }catch (Exception e2){
                    e2.printStackTrace();
                }


            }
            return hospital;
        }
        public static Hospital almacenarPacientes(Hospital hospital) {
            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;

            try {

                archivo = new File ("C:\\Users\\jluen\\IdeaProjects\\Hospital1\\src\\pacientes.txt");
                fr = new FileReader (archivo);
                br = new BufferedReader(fr);

                // Lectura del fichero
                String linea;
                while((linea=br.readLine())!=null ) {
                    String[] datos = linea.split(",");
                    hospital.agregarPaciente(datos[0], Integer.parseInt(datos[1]),datos[2]);
                }


            }
            catch(Exception e){
                e.printStackTrace();

            }finally{
                try{
                    if( null != fr ){
                        fr.close();
                    }
                }catch (Exception e2){
                    e2.printStackTrace();
                }


            }
            return hospital;
        }


    }
