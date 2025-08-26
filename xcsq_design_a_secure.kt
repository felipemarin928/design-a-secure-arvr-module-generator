data class ARVRModule(
    val id: String,
    val moduleName: String,
    val description: String,
    val category: Category,
    val securityFeatures: List<SecurityFeature>,
    val dependencies: List<Dependency>,
    val vrMode: Boolean,
    val arMode: Boolean,
    val version: String
)

enum class Category {
    GAME, EDUCATION, ENTERTAINMENT, PRODUCTIVITY
}

data class SecurityFeature(
    val id: String,
    val featureName: String,
    val description: String,
    val enabled: Boolean
)

data class Dependency(
    val id: String,
    val dependencyName: String,
    val description: String,
    val version: String
)

data class ModuleGeneratorConfig(
    val securityLevel: SecurityLevel,
    val moduleType: ModuleType
)

enum class SecurityLevel {
    LOW, MEDIUM, HIGH
}

enum class ModuleType {
    AR, VR, BOTH
}

data class GeneratedModule(
    val moduleId: String,
    val moduleName: String,
    val description: String,
    val category: Category,
    val securityFeatures: List<SecurityFeature>,
    val dependencies: List<Dependency>,
    val vrMode: Boolean,
    val arMode: Boolean,
    val version: String,
    val generatorConfig: ModuleGeneratorConfig
)