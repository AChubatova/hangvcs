package ProjectDependency.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object ProjectDependency_Powershellchubatova : GitVcsRoot({
    name = "powershellchubatova"
    url = "https://github.com/AChubatova/TC_Chubatova_Test_Repository"
    branch = "refs/heads/master"
    authMethod = password {
        userName = "AChubatova"
        password = "credentialsJSON:4c824a5f-22f5-4a42-b518-1d40b41937ec"
    }
    param("useAlternates", "true")
})
