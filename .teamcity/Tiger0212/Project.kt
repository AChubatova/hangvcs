package Tiger0212

import Tiger0212.buildTypes.*
import Tiger0212.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0212")
    name = "Tiger0212"

    vcsRoot(Tiger0212_cVCSroot)

    buildType(Tiger0212_Hi2)
    buildType(Tiger0212_Hi3)
    buildType(Tiger0212_Hi0)
    buildType(Tiger0212_Hi1)
})
