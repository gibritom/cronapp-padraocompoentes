package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Elastick {

public static final int TIMEOUT = 300;

/**
 *
 * @param filtro
 * @param indicepes
 *
 * @author Gilberto De Brito Amorim
 * @since 19/07/2024, 17:58:02
 *
 */
public static Var Pesquisar(@ParamMetaData(description = "filtro", id = "8aa2415e") Var filtro, @ParamMetaData(description = "indicepes", id = "c826e5d7") Var indicepes) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    System.out.println(
    cronapp.elastic.CronappElastic.search(
    cronapi.util.Operations.callBlockly(Var.valueOf("blockly.Elastick:criarcontexto")).getTypedObject(org.elasticsearch.client.RestHighLevelClient.class), indicepes.getTypedObject(java.lang.String.class),
    Var.VAR_NULL,
    Var.valueOf(300), filtro.getTypedObject(java.lang.String.class)).getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param atualizaid
 * @param conteudo
 * @param indiceatualiza
 *
 * @author Gilberto De Brito Amorim
 * @since 19/07/2024, 17:58:02
 *
 */
public static Var atualizaID(@ParamMetaData(description = "atualizaid", id = "b443358c") Var atualizaid, @ParamMetaData(description = "conteudo", id = "d30fe43b") Var conteudo, @ParamMetaData(description = "indiceatualiza", id = "473067da") Var indiceatualiza) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapp.elastic.CronappElastic.updateById(
    cronapi.util.Operations.callBlockly(Var.valueOf("blockly.Elastick:criarcontexto")).getTypedObject(org.elasticsearch.client.RestHighLevelClient.class), indiceatualiza.getTypedObject(java.lang.String.class), atualizaid.getTypedObject(java.lang.String.class), conteudo);
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @author Gilberto De Brito Amorim
 * @since 19/07/2024, 17:58:02
 *
 */
public static Var criarcontexto() throws Exception {
 return new Callable<Var>() {

   private Var removeindice = Var.VAR_NULL;
   private Var removeid = Var.VAR_NULL;
   private Var indiceatualiza = Var.VAR_NULL;
   private Var atualizaid = Var.VAR_NULL;
   private Var conteudo = Var.VAR_NULL;
   private Var indice = Var.VAR_NULL;
   private Var id2 = Var.VAR_NULL;
   private Var json = Var.VAR_NULL;
   private Var indicepes = Var.VAR_NULL;
   private Var filtro = Var.VAR_NULL;

   public Var call() throws Exception {
    return
Var.valueOf(cronapp.elastic.CronappElastic.configure(
cronapi.screen.Operations.getValueOfField(
Var.valueOf("vars.contexto")).getTypedObject(java.lang.String.class),
Var.valueOf("qaelasticprod.cloud.cronapp.io").getTypedObject(java.lang.String.class),
Var.valueOf("elastic").getTypedObject(java.lang.String.class),
Var.valueOf("PassW0rd").getTypedObject(java.lang.String.class)));
   }
 }.call();
}

/**
 *
 * @param contexto
 *
 * @author Gilberto De Brito Amorim
 * @since 19/07/2024, 17:58:02
 *
 */
public static Var fechar(@ParamMetaData(description = "contexto", id = "731904ab") Var contexto) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapp.elastic.CronappElastic.close(
    cronapi.util.Operations.callBlockly(Var.valueOf("blockly.Elastick:namespace"), Var.valueOf("c96efe63", Var.VAR_NULL)).getTypedObject(org.elasticsearch.client.RestHighLevelClient.class));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param indice
 * @param id
 * @param json
 *
 * @author Gilberto De Brito Amorim
 * @since 19/07/2024, 17:58:02
 *
 */
public static void inserir(@ParamMetaData(description = "indice", id = "a4cd6df6") Var indice, @ParamMetaData(description = "id2", id = "0a48a060") Var id2, @ParamMetaData(description = "json", id = "ae4e4a48") Var json) throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
    cronapp.elastic.CronappElastic.insert(
    Var.valueOf(cronapp.elastic.CronappElastic.configure(
    Var.valueOf("default").getTypedObject(java.lang.String.class),
    Var.valueOf("qaelasticprod.cloud.cronapp.io").getTypedObject(java.lang.String.class),
    Var.valueOf("elastic").getTypedObject(java.lang.String.class),
    Var.valueOf("PassW0rd").getTypedObject(java.lang.String.class))).getTypedObject(org.elasticsearch.client.RestHighLevelClient.class), indice.getTypedObject(java.lang.String.class), id2.getTypedObject(java.lang.String.class), json);
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param obterid
 * @param obterindice
 *
 * @author Gilberto De Brito Amorim
 * @since 19/07/2024, 17:58:02
 *
 */
public static Var obterid(@ParamMetaData(description = "obterid", id = "2af3b78e") Var obterid, @ParamMetaData(description = "obterindice", id = "117acfd2") Var obterindice) throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    item =
    cronapi.conversion.Operations.toString(
    cronapp.elastic.CronappElastic.getById(
    cronapi.util.Operations.callBlockly(Var.valueOf("blockly.Elastick:criarcontexto")).getTypedObject(org.elasticsearch.client.RestHighLevelClient.class), obterindice.getTypedObject(java.lang.String.class), obterid.getTypedObject(java.lang.String.class)));
    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), item);
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param removeid
 * @param removeindice
 *
 * @author Gilberto De Brito Amorim
 * @since 19/07/2024, 17:58:02
 *
 */
public static Var removerporid(@ParamMetaData(description = "removeid", id = "e3f41863") Var removeid, @ParamMetaData(description = "removeindice", id = "8c2a7c31") Var removeindice) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapp.elastic.CronappElastic.deleteById(
    cronapi.util.Operations.callBlockly(Var.valueOf("blockly.Elastick:criarcontexto")).getTypedObject(org.elasticsearch.client.RestHighLevelClient.class), removeindice.getTypedObject(java.lang.String.class), removeid.getTypedObject(java.lang.String.class));
    return Var.VAR_NULL;
   }
 }.call();
}

}

