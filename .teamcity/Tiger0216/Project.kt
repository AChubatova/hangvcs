package Tiger0216

import Tiger0216.buildTypes.*
import Tiger0216.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0216")
    name = "Tiger0216"

    vcsRoot(Tiger0216_cVCSroot)

    buildType(Tiger0216_Hi0)
    buildType(Tiger0216_Hi1)
    buildType(Tiger0216_Hi2)
    buildType(Tiger0216_Hi3)
})
