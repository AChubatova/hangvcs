package Tiger028

import Tiger028.buildTypes.*
import Tiger028.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger028")
    name = "Tiger028"

    vcsRoot(Tiger028_cVCSroot)

    buildType(Tiger028_Hi1)
    buildType(Tiger028_Hi2)
    buildType(Tiger028_Hi3)
    buildType(Tiger028_Hi0)
})
