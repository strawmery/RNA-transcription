# RNA Transcription

¡Bienvenido a la kata RNA Transcription en la pista de Java de Exercism! 🎉

Si necesitas ayuda para ejecutar las pruebas o enviar tu código, consulta `HELP.md`.

## Introducción

Trabajas en una empresa de bioingeniería especializada en el desarrollo de soluciones terapéuticas.

Tu equipo ha recibido un nuevo proyecto: desarrollar una terapia dirigida para un raro tipo de cáncer. El objetivo general es crear una molécula específica, llamada micro-RNA, que pueda prevenir la producción de proteínas problemáticas en el cuerpo humano.

Este enfoque terapéutico se conoce como RNA Interference (RNAi).

Tu contribución es esencial para este proyecto.

## Instrucciones

Tu tarea es determinar la complementaria en RNA de una secuencia de DNA dada.

### ¿Qué son DNA y RNA?

DNA y RNA son cadenas de nucleótidos. Los nucleótidos son las unidades básicas de estas moléculas y se representan como letras:

| DNA | RNA |
| --- | --- |
| Adenina (A) | Adenina (A) |
| Citosina (C) | Citosina (C) |
| Guanina (G) | Guanina (G) |
| Timina (T) | Uracilo (U) |

### Reglas de transcripción

Para obtener la cadena de RNA a partir de una cadena de DNA:

Reemplaza cada nucleótido con su complemento:
- G → C
- C → G
- T → A
- A → U

#### Ejemplo

Si la entrada es:
GCTA

La salida será:
CGAU

## Tecnologías

- **Lenguaje:** Java
- **Herramientas:** JUnit para pruebas automatizadas.

## Cómo empezar

1. Clona el repositorio.
2. Lee el archivo `HELP.md` para configurar tu entorno.
3. Implementa la solución en el archivo correspondiente.
4. Ejecuta las pruebas para validar tu solución.
