package Nunit.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object Nunit_HttpsGithubComAChubatovaNunitRefsHeadsMaster : GitVcsRoot({
    name = "https://github.com/AChubatova/nunit#refs/heads/master"
    url = "https://github.com/AChubatova/nunit"
    branch = "refs/heads/master"
    authMethod = password {
        userName = "AChubatova"
        password = "credentialsJSON:ccfd5e07-f3ef-40cb-a4d5-91b669936d62"
    }
    param("useAlternates", "true")
})
