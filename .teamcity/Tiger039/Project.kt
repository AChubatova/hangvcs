package Tiger039

import Tiger039.buildTypes.*
import Tiger039.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger039")
    name = "Tiger039"

    vcsRoot(Tiger039_cVCSroot)

    buildType(Tiger039_Hi3)
    buildType(Tiger039_Hi2)
    buildType(Tiger039_Hi1)
    buildType(Tiger039_Hi0)
})
