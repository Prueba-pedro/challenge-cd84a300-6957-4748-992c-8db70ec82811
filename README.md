# Desarrollo de API REST Empresarial para e-commerce

El sistema debe gestionar productos y pedidos en un entorno de e-commerce, asegurando la consistencia de datos y la seguridad de acceso. El dominio incluye entidades como Product, Order y Customer, con relaciones complejas. El sistema debe soportar autenticación y autorización basada en JWT, documentación automática de API, y manejo centralizado de errores. Se espera una arquitectura en capas que incluya controladores REST, servicios de negocio y repositorios JPA, siguiendo principios SOLID y clean code.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Arquitectura Empresarial con Spring Boot |
| **Nivel** | junior-l3 |
| **Tipo** | practical |
| **Tiempo estimado** | 40 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición del dominio y modelado de datos

**Objetivo:** Definir las entidades y relaciones del dominio, asegurando la consistencia y la integridad de datos.

**Tiempo estimado:** 8 horas

**Instrucciones:**

- Identificar y definir las entidades Product, Order y Customer.
- Establecer las relaciones OneToMany y ManyToMany entre las entidades.
- Definir las restricciones y validaciones necesarias para cada entidad.

**Entregable:** Modelo de datos completo con entidades y relaciones definidas.

<details>
<summary>Pistas de conocimiento</summary>

- Considera los atributos necesarios para cada entidad.
- Piensa en las relaciones lógicas entre las entidades.
- Define las validaciones y restricciones necesarias para asegurar la integridad de datos.

</details>

### Fase 2: Implementación de la arquitectura en capas

**Objetivo:** Implementar la arquitectura en capas del sistema, incluyendo controladores REST, servicios de negocio y repositorios JPA.

**Tiempo estimado:** 12 horas

**Instrucciones:**

- Crear los controladores REST para las operaciones CRUD de las entidades.
- Implementar los servicios de negocio que encapsulan la lógica de negocio.
- Configurar los repositorios JPA para persistir las entidades en la base de datos.

**Entregable:** Arquitectura en capas implementada con controladores REST, servicios de negocio y repositorios JPA.

<details>
<summary>Pistas de conocimiento</summary>

- Sigue los principios SOLID y clean code en cada capa.
- Utiliza anotaciones y configuraciones adecuadas para cada componente.
- Asegura que los controladores REST sean idempotentes y manejen correctamente los errores.

</details>

### Fase 3: Autenticación y autorización basada en JWT

**Objetivo:** Implementar la autenticación y autorización basada en JWT, asegurando el acceso diferenciado por endpoint.

**Tiempo estimado:** 8 horas

**Instrucciones:**

- Configurar la autenticación y autorización basada en JWT.
- Definir los roles de ADMIN y USER con acceso diferenciado por endpoint.
- Asegurar que los endpoints estén protegidos según los roles definidos.

**Entregable:** Sistema con autenticación y autorización basada en JWT implementada.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza configuraciones y anotaciones adecuadas para la autenticación y autorización.
- Define los roles y permisos necesarios para cada endpoint.
- Asegura que los endpoints estén correctamente protegidos.

</details>

### Fase 4: Documentación automática y manejo de errores

**Objetivo:** Implementar la documentación automática de la API y el manejo centralizado de errores.

**Tiempo estimado:** 6 horas

**Instrucciones:**

- Configurar la documentación automática con OpenAPI 3.0 y Swagger UI.
- Implementar el manejo centralizado de errores con @ControllerAdvice.
- Asegurar que las respuestas de error estén estandarizadas en formato JSON.

**Entregable:** Sistema con documentación automática y manejo centralizado de errores implementado.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza anotaciones y configuraciones adecuadas para la documentación automática.
- Implementa el manejo centralizado de errores siguiendo buenas prácticas.
- Asegura que las respuestas de error sean claras y estandarizadas.

</details>

### Fase 5: Validación de entradas y paginación

**Objetivo:** Implementar la validación de entradas y la paginación de resultados en los endpoints de listado.

**Tiempo estimado:** 6 horas

**Instrucciones:**

- Implementar la validación de entradas con Bean Validation.
- Configurar la paginación y ordenamiento de resultados en los endpoints de listado usando Pageable.
- Asegurar que las validaciones y la paginación funcionen correctamente.

**Entregable:** Sistema con validación de entradas y paginación de resultados implementada.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza anotaciones y configuraciones adecuadas para la validación de entradas.
- Configura la paginación y ordenamiento de resultados siguiendo buenas prácticas.
- Asegura que las validaciones y la paginación funcionen correctamente.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son las entidades Product, Order y Customer y cómo se relacionan entre sí?
- **paraQueSirve**: ¿Para qué sirve la autenticación y autorización basada en JWT en el sistema?
- **comoSeUsa**: ¿Cómo se usa la documentación automática con OpenAPI 3.0 y Swagger UI en el sistema?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar el manejo centralizado de errores con @ControllerAdvice?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación de la validación de entradas y la paginación de resultados en los endpoints de listado?

## Criterios de Evaluacion

- Definición correcta de las entidades y relaciones del dominio.
- Implementación de la arquitectura en capas siguiendo principios SOLID y clean code.
- Configuración correcta de la autenticación y autorización basada en JWT.
- Implementación de la documentación automática con OpenAPI 3.0 y Swagger UI.
- Implementación del manejo centralizado de errores con @ControllerAdvice.
- Implementación de la validación de entradas y la paginación de resultados en los endpoints de listado.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
