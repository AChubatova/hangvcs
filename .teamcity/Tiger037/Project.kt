package Tiger037

import Tiger037.buildTypes.*
import Tiger037.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger037")
    name = "Tiger037"

    vcsRoot(Tiger037_cVCSroot)

    buildType(Tiger037_Hi3)
    buildType(Tiger037_Hi2)
    buildType(Tiger037_Hi1)
    buildType(Tiger037_Hi0)
})
