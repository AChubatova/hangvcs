package Tiger038

import Tiger038.buildTypes.*
import Tiger038.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger038")
    name = "Tiger038"

    vcsRoot(Tiger038_cVCSroot)

    buildType(Tiger038_Hi3)
    buildType(Tiger038_Hi2)
    buildType(Tiger038_Hi1)
    buildType(Tiger038_Hi0)
})
