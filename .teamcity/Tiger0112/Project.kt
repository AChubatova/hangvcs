package Tiger0112

import Tiger0112.buildTypes.*
import Tiger0112.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0112")
    name = "Tiger0112"

    vcsRoot(Tiger0112_cVCSroot)

    buildType(Tiger0112_Hi3)
    buildType(Tiger0112_Hi1)
    buildType(Tiger0112_Hi2)
    buildType(Tiger0112_Hi0)
})
