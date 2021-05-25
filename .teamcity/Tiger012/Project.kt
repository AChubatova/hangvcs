package Tiger012

import Tiger012.buildTypes.*
import Tiger012.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger012")
    name = "Tiger012"

    vcsRoot(Tiger012_cVCSroot)

    buildType(Tiger012_Hi3)
    buildType(Tiger012_Hi2)
    buildType(Tiger012_Hi1)
    buildType(Tiger012_Hi0)
})
