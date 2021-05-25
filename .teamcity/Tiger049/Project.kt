package Tiger049

import Tiger049.buildTypes.*
import Tiger049.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger049")
    name = "Tiger049"

    vcsRoot(Tiger049_cVCSroot)

    buildType(Tiger049_Hi0)
    buildType(Tiger049_Hi1)
    buildType(Tiger049_Hi2)
    buildType(Tiger049_Hi3)
})
