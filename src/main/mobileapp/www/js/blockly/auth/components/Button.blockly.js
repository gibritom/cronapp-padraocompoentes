window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.auth = window.blockly.js.blockly.auth || {};
window.blockly.js.blockly.auth.components = window.blockly.js.blockly.auth.components || {};
window.blockly.js.blockly.auth.components.Button = window.blockly.js.blockly.auth.components.Button || {};

/**
 * @function Executar
 *
 *
 *
 *
 * @author Leandro Leonardo Assarice
 * @since 21/03/2024, 14:37:34
 *
 */
window.blockly.js.blockly.auth.components.Button.ExecutarArgs = [];
window.blockly.js.blockly.auth.components.Button.Executar = async function() {

  //
  this.cronapi.screen.changeValueOfField("vars.resp", 'Bloco Mobile Check');
}
