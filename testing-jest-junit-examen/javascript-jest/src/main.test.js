const { multiplicar, esPositivo, contarLetras, saludar } = require("./main.js");

describe("multiplicar", () => {
  test("3 por 4 devuelve 12", () => expect(multiplicar(3, 4)).toBe(12));
  test("multiplicar por cero devuelve cero", () => expect(multiplicar(0, 9)).toBe(0));
  test("3 por 4 no devuelve 13", () => expect(multiplicar(3, 4)).not.toBe(13));
});

describe("esPositivo", () => {
  test("8 es positivo", () => expect(esPositivo(8)).toBe(true));
  test("0 no es positivo", () => expect(esPositivo(0)).toBe(false));
});

describe("contarLetras", () => {
  test("Hola tiene 4 caracteres", () => expect(contarLetras("Hola")).toBe(4));
});

describe("saludar", () => {
  test("Ali devuelve Hola Ali", () => expect(saludar("Ali")).toBe("Hola Ali"));
});
