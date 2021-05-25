package Tiger0014

import Tiger0014.buildTypes.*
import Tiger0014.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0014")
    name = "Tiger0014"

    vcsRoot(Tiger0014_cVCSroot)

    buildType(Tiger0014_Hi1)
    buildType(Tiger0014_Hi0)
    buildType(Tiger0014_Hi3)
    buildType(Tiger0014_Hi2)
})
